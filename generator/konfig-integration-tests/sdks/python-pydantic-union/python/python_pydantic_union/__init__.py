# coding: utf-8

# flake8: noqa

"""
    python-pydantic-union API

    A simple API based for testing python-pydantic-union.

    The version of the OpenAPI document: 1.0.0
    Contact: support@example.com
    Created by: http://example.com/support
"""

__version__ = "1.0.0"

# import ApiClient
from python_pydantic_union.api_client import ApiClient

# import Configuration
from python_pydantic_union.configuration import Configuration

# import exceptions
from python_pydantic_union.exceptions import OpenApiException
from python_pydantic_union.exceptions import ApiAttributeError
from python_pydantic_union.exceptions import ApiTypeError
from python_pydantic_union.exceptions import ApiValueError
from python_pydantic_union.exceptions import ApiKeyError
from python_pydantic_union.exceptions import ApiException

from python_pydantic_union.client import PythonPydanticUnion
