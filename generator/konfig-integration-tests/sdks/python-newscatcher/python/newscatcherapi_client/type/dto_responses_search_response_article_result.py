# coding: utf-8

"""
    NewsCatcher-V3 Production API

    <img src='https://uploads-ssl.webflow.com/6429857b17973b636c2195c5/646c6f1eb774ff2f2997bec5_newscatcher_.svg' width='286' height='35' /> <br>  <br>Visit our website  <a href='https://newscatcherapi.com'>https://newscatcherapi.com</a>

    The version of the OpenAPI document: Beta-3.0.0
    Contact: maksym@newscatcherapi.com
    Generated by: https://konfigthis.com
"""

from datetime import datetime, date
import typing
from enum import Enum
from typing_extensions import TypedDict, Literal, TYPE_CHECKING


class RequiredDtoResponsesSearchResponseArticleResult(TypedDict):
    title: str

    link: str

    domain_url: str

    full_domain_url: str

    extraction_data: str

    rank: int

    id: str

    score: typing.Union[int, float]


class OptionalDtoResponsesSearchResponseArticleResult(TypedDict, total=False):
    description: str

    author: str

    authors: typing.Union[typing.List[str], str]

    journalists: typing.Union[typing.List[str], str]

    published_date: str

    published_date_precision: str

    updated_date: str

    updated_date_precision: str

    parse_date: str

    name_source: str

    is_headline: str

    paid_content: bool

    country: str

    rights: str

    media: str

    language: str

    content: str

    word_count: int

    is_opinion: bool

    twitter_account: str

    all_links: typing.Union[typing.List[str], str]

    all_domain_links: typing.Union[typing.List[str], str]

    nlp: typing.Dict[str, typing.Union[bool, date, datetime, dict, float, int, list, str, None]]

class DtoResponsesSearchResponseArticleResult(RequiredDtoResponsesSearchResponseArticleResult, OptionalDtoResponsesSearchResponseArticleResult):
    pass
