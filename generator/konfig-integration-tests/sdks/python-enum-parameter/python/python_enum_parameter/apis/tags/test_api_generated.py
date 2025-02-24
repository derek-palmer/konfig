# coding: utf-8
"""
    python-enum-parameter API

    A simple API based for testing python-enum-parameter.

    The version of the OpenAPI document: 1.0.0
    Contact: support@example.com
    Created by: http://example.com/support
"""

from python_enum_parameter.paths.simple_endpoint.get import Fetch
from python_enum_parameter.apis.tags.test_api_raw import TestApiRaw


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
