# coding: utf-8

"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from python_splitit_client import schemas  # noqa: F401


class RefundStatus(
    schemas.EnumBase,
    schemas.StrSchema
):
    """
    This class is auto generated by Konfig (https://konfigthis.com)
    """


    class MetaOapg:
        enum_value_to_name = {
            "Pending": "PENDING",
            "Succeeded": "SUCCEEDED",
            "Failed": "FAILED",
        }
    
    @schemas.classproperty
    def PENDING(cls):
        return cls("Pending")
    
    @schemas.classproperty
    def SUCCEEDED(cls):
        return cls("Succeeded")
    
    @schemas.classproperty
    def FAILED(cls):
        return cls("Failed")
