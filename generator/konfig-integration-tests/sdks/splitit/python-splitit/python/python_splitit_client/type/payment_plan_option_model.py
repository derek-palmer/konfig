# coding: utf-8

"""
    splitit-web-api-v3

    Splitit's Web API

    The version of the OpenAPI document: 1.0.0
    Generated by: https://konfigthis.com
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal, TYPE_CHECKING

from python_splitit_client.type.links_model import LinksModel

class RequiredPaymentPlanOptionModel(TypedDict):
    NumberOfInstallments: int

    FirstInstallmentAmount: typing.Union[int, float]

    InstallmentAmount: typing.Union[int, float]

    LastInstallmentAmount: typing.Union[int, float]


class OptionalPaymentPlanOptionModel(TypedDict, total=False):
    Links: LinksModel

    TermsAndConditionsBrief: str

    InstallmentFrequency: str

class PaymentPlanOptionModel(RequiredPaymentPlanOptionModel, OptionalPaymentPlanOptionModel):
    pass
