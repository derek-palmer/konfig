# coding: utf-8
"""
    python-ignore-pydantic-protected-namespaces API

    A simple API based for testing python-ignore-pydantic-protected-namespaces.

    The version of the OpenAPI document: 1.0.0
    Contact: support@example.com
    Created by: http://example.com/support
"""

from python_ignore_pydantic_protected_namespaces.paths.simple_endpoint.get import Fetch
from python_ignore_pydantic_protected_namespaces.apis.tags.test_api_raw import TestApiRaw


class TestApiGenerated(
    Fetch,
):
    """NOTE:
    This class is auto generated by Konfig (https://konfigthis.com)
    """
    raw: TestApiRaw

    def __init__(self, api_client=None):
        super().__init__(api_client)
        self.raw = TestApiRaw(api_client)
