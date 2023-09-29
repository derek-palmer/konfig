#!/bin/bash

cd "$(dirname "$0")"

# get the api keys from api-keys.ts
keyFile="../api/src/lib/api-keys.ts"
apiKeys=($(grep -oE '[A-Za-z0-9]{32}:' "$keyFile" | sed 's/://'))

searchFolder="../../.." # entire repo
foundKey=false

# Files that are allowed to contain the api key
whitelist=(
  "../../../generator/konfig-dash/api/dist/lib/api-keys.js"
  "../../../generator/konfig-dash/.redwood/prebuild/api/src/lib/api-keys.js"
  "../../../generator/konfig-dash/api/src/lib/api-keys.ts"
  "../../../generator/konfig-dash/api/dist/lib/api-keys.js.map"
)

for apiKey in "${apiKeys[@]}"; do
  files=$(grep -rl "$apiKey" "$searchFolder" | grep -vE "$(printf "%s\n" "${whitelist[@]}")")
  if [ -n "$files" ]; then
    foundKey=true
    echo "ERROR: Security risk detected. API key leaked in the following files:"
    echo "$files"
    echo
  fi
done

if [ "$foundKey" = true ]; then
  exit 1
fi
echo No api key leaks detected.
exit 0
