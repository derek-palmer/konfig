/* tslint:disable */
/* eslint-disable */
/**
 * Konfig REST API
 * To help you generate SDKs with Konfig
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction, isBrowser } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { LintRequestBody } from '../models';
// @ts-ignore
import { LintResponseBody } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * LintingApi - axios parameter creator
 * @export
 */
export const LintingApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Lint your OpenAPI Specification to ensure generation of high quality SDKs with Konfig
         * @summary Lint your OpenAPI Specification
         * @param {LintRequestBody} lintRequestBody 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        lint: async (lintRequestBody: LintRequestBody, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'lintRequestBody' is not null or undefined
            assertParamExists('lint', 'lintRequestBody', lintRequestBody)
            const localVarPath = `/lint`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'POST', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration && !isBrowser() ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;


    
            localVarHeaderParameter['Content-Type'] = 'application/json';

            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};
            requestBeforeHook({
                requestBody: lintRequestBody,
                queryParameters: localVarQueryParameter,
                requestConfig: localVarRequestOptions,
                path: localVarPath,
                configuration
            });
            localVarRequestOptions.data = serializeDataIfNeeded(lintRequestBody, localVarRequestOptions, configuration)

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * LintingApi - functional programming interface
 * @export
 */
export const LintingApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = LintingApiAxiosParamCreator(configuration)
    return {
        /**
         * Lint your OpenAPI Specification to ensure generation of high quality SDKs with Konfig
         * @summary Lint your OpenAPI Specification
         * @param {LintingApiLintRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async lint(requestParameters: LintingApiLintRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<LintResponseBody>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.lint(requestParameters, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * LintingApi - factory interface
 * @export
 */
export const LintingApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = LintingApiFp(configuration)
    return {
        /**
         * Lint your OpenAPI Specification to ensure generation of high quality SDKs with Konfig
         * @summary Lint your OpenAPI Specification
         * @param {LintingApiLintRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        lint(requestParameters: LintingApiLintRequest, options?: AxiosRequestConfig): AxiosPromise<LintResponseBody> {
            return localVarFp.lint(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for lint operation in LintingApi.
 * @export
 * @interface LintingApiLintRequest
 */
export type LintingApiLintRequest = {
    
} & LintRequestBody

/**
 * LintingApiGenerated - object-oriented interface
 * @export
 * @class LintingApiGenerated
 * @extends {BaseAPI}
 */
export class LintingApiGenerated extends BaseAPI {
    /**
     * Lint your OpenAPI Specification to ensure generation of high quality SDKs with Konfig
     * @summary Lint your OpenAPI Specification
     * @param {LintingApiLintRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof LintingApiGenerated
     */
    public lint(requestParameters: LintingApiLintRequest, options?: AxiosRequestConfig) {
        return LintingApiFp(this.configuration).lint(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
