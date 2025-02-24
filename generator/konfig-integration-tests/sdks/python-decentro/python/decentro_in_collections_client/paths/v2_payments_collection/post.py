# coding: utf-8

"""
    decentro-in-collections

    Collections

    The version of the OpenAPI document: 1.0.0
    Contact: admin@decentro.tech
    Created by: https://decentro.tech
"""

from dataclasses import dataclass
import typing_extensions
import urllib3
from pydantic import RootModel
from decentro_in_collections_client.request_before_hook import request_before_hook
import json
from urllib3._collections import HTTPHeaderDict

from decentro_in_collections_client.api_response import AsyncGeneratorResponse
from decentro_in_collections_client import api_client, exceptions
from datetime import date, datetime  # noqa: F401
import decimal  # noqa: F401
import functools  # noqa: F401
import io  # noqa: F401
import re  # noqa: F401
import typing  # noqa: F401
import typing_extensions  # noqa: F401
import uuid  # noqa: F401

import frozendict  # noqa: F401

from decentro_in_collections_client import schemas  # noqa: F401

from decentro_in_collections_client.model.issue_collect_request400_response import IssueCollectRequest400Response as IssueCollectRequest400ResponseSchema
from decentro_in_collections_client.model.issue_collect_request_request import IssueCollectRequestRequest as IssueCollectRequestRequestSchema
from decentro_in_collections_client.model.issue_collect_request_response import IssueCollectRequestResponse as IssueCollectRequestResponseSchema

from decentro_in_collections_client.type.issue_collect_request_response import IssueCollectRequestResponse
from decentro_in_collections_client.type.issue_collect_request_request import IssueCollectRequestRequest
from decentro_in_collections_client.type.issue_collect_request400_response import IssueCollectRequest400Response

from ...api_client import Dictionary
from decentro_in_collections_client.pydantic.issue_collect_request_response import IssueCollectRequestResponse as IssueCollectRequestResponsePydantic
from decentro_in_collections_client.pydantic.issue_collect_request400_response import IssueCollectRequest400Response as IssueCollectRequest400ResponsePydantic
from decentro_in_collections_client.pydantic.issue_collect_request_request import IssueCollectRequestRequest as IssueCollectRequestRequestPydantic

from . import path

# body param
SchemaForRequestBodyApplicationJson = IssueCollectRequestRequestSchema


request_body_issue_collect_request_request = api_client.RequestBody(
    content={
        'application/json': api_client.MediaType(
            schema=SchemaForRequestBodyApplicationJson),
    },
    required=True,
)
_auth = [
    'client_id',
    'client_secret',
    'module_secret',
    'provider_secret',
]
SchemaFor200ResponseBodyApplicationJson = IssueCollectRequestResponseSchema


@dataclass
class ApiResponseFor200(api_client.ApiResponse):
    body: IssueCollectRequestResponse


@dataclass
class ApiResponseFor200Async(api_client.AsyncApiResponse):
    body: IssueCollectRequestResponse


_response_for_200 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor200,
    response_cls_async=ApiResponseFor200Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor200ResponseBodyApplicationJson),
    },
)
SchemaFor400ResponseBodyApplicationJson = IssueCollectRequest400ResponseSchema


@dataclass
class ApiResponseFor400(api_client.ApiResponse):
    body: IssueCollectRequest400Response


@dataclass
class ApiResponseFor400Async(api_client.AsyncApiResponse):
    body: IssueCollectRequest400Response


_response_for_400 = api_client.OpenApiResponse(
    response_cls=ApiResponseFor400,
    response_cls_async=ApiResponseFor400Async,
    content={
        'application/json': api_client.MediaType(
            schema=SchemaFor400ResponseBodyApplicationJson),
    },
)
_status_code_to_response = {
    '200': _response_for_200,
    '400': _response_for_400,
}
_all_accept_content_types = (
    'application/json',
)


class BaseApi(api_client.Api):

    def _issue_collect_request_mapped_args(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
    ) -> api_client.MappedArgs:
        args: api_client.MappedArgs = api_client.MappedArgs()
        _body = {}
        if reference_id is not None:
            _body["reference_id"] = reference_id
        if payer_upi is not None:
            _body["payer_upi"] = payer_upi
        if payee_account is not None:
            _body["payee_account"] = payee_account
        if amount is not None:
            _body["amount"] = amount
        if purpose_message is not None:
            _body["purpose_message"] = purpose_message
        if expiry_time is not None:
            _body["expiry_time"] = expiry_time
        args.body = body if body is not None else _body
        return args

    async def _aissue_collect_request_oapg(
        self,
        body: typing.Any = None,
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[float, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
        **kwargs,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        """
        Issue collect request
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'post'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            path_template='/v2/payments/collection',
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_issue_collect_request_request.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = await self.api_client.async_call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
            **kwargs
        )
    
        if stream:
            if not 200 <= response.http_response.status <= 299:
                body = (await response.http_response.content.read()).decode("utf-8")
                raise exceptions.ApiStreamingException(
                    status=response.http_response.status,
                    reason=response.http_response.reason,
                    body=body,
                )
    
            async def stream_iterator():
                """
                iterates over response.http_response.content and closes connection once iteration has finished
                """
                async for line in response.http_response.content:
                    if line == b'\r\n':
                        continue
                    yield line
                response.http_response.close()
                await response.session.close()
            return AsyncGeneratorResponse(
                content=stream_iterator(),
                headers=response.http_response.headers,
                status=response.http_response.status,
                response=response.http_response
            )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = await response_for_status.deserialize_async(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserializationAsync(
                body=await response.http_response.json() if is_json else await response.http_response.text(),
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        # cleanup session / response
        response.http_response.close()
        await response.session.close()
    
        return api_response


    def _issue_collect_request_oapg(
        self,
        body: typing.Any = None,
        skip_deserialization: bool = True,
        timeout: typing.Optional[typing.Union[float, typing.Tuple]] = None,
        accept_content_types: typing.Tuple[str] = _all_accept_content_types,
        content_type: str = 'application/json',
        stream: bool = False,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """
        Issue collect request
        :param skip_deserialization: If true then api_response.response will be set but
            api_response.body and api_response.headers will not be deserialized into schema
            class instances
        """
        used_path = path.value
    
        _headers = HTTPHeaderDict()
        # TODO add cookie handling
        if accept_content_types:
            for accept_content_type in accept_content_types:
                _headers.add('Accept', accept_content_type)
        method = 'post'.upper()
        _headers.add('Content-Type', content_type)
    
        if body is schemas.unset:
            raise exceptions.ApiValueError(
                'The required body parameter has an invalid value of: unset. Set a valid value instead')
        _fields = None
        _body = None
        request_before_hook(
            resource_path=used_path,
            method=method,
            configuration=self.api_client.configuration,
            path_template='/v2/payments/collection',
            body=body,
            auth_settings=_auth,
            headers=_headers,
        )
        serialized_data = request_body_issue_collect_request_request.serialize(body, content_type)
        if 'fields' in serialized_data:
            _fields = serialized_data['fields']
        elif 'body' in serialized_data:
            _body = serialized_data['body']
    
        response = self.api_client.call_api(
            resource_path=used_path,
            method=method,
            headers=_headers,
            fields=_fields,
            serialized_body=_body,
            body=body,
            auth_settings=_auth,
            timeout=timeout,
        )
    
        response_for_status = _status_code_to_response.get(str(response.http_response.status))
        if response_for_status:
            api_response = response_for_status.deserialize(
                                                    response,
                                                    self.api_client.configuration,
                                                    skip_deserialization=skip_deserialization
                                                )
        else:
            # If response data is JSON then deserialize for SDK consumer convenience
            is_json = api_client.JSONDetector._content_type_is_json(response.http_response.headers.get('Content-Type', ''))
            api_response = api_client.ApiResponseWithoutDeserialization(
                body=json.loads(response.http_response.data) if is_json else response.http_response.data,
                response=response.http_response,
                round_trip_time=response.round_trip_time,
                status=response.http_response.status,
                headers=response.http_response.headers,
            )
    
        if not 200 <= api_response.status <= 299:
            raise exceptions.ApiException(api_response=api_response)
    
        return api_response


class IssueCollectRequestRaw(BaseApi):
    # this class is used by api classes that refer to endpoints with operationId fn names

    async def aissue_collect_request(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
        **kwargs,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._issue_collect_request_mapped_args(
            body=body,
            reference_id=reference_id,
            payer_upi=payer_upi,
            payee_account=payee_account,
            amount=amount,
            purpose_message=purpose_message,
            expiry_time=expiry_time,
        )
        return await self._aissue_collect_request_oapg(
            body=args.body,
            **kwargs,
        )
    
    def issue_collect_request(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """  """
        args = self._issue_collect_request_mapped_args(
            body=body,
            reference_id=reference_id,
            payer_upi=payer_upi,
            payee_account=payee_account,
            amount=amount,
            purpose_message=purpose_message,
            expiry_time=expiry_time,
        )
        return self._issue_collect_request_oapg(
            body=args.body,
        )

class IssueCollectRequest(BaseApi):

    async def aissue_collect_request(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
        validate: bool = False,
        **kwargs,
    ) -> IssueCollectRequestResponsePydantic:
        raw_response = await self.raw.aissue_collect_request(
            body=body,
            reference_id=reference_id,
            payer_upi=payer_upi,
            payee_account=payee_account,
            amount=amount,
            purpose_message=purpose_message,
            expiry_time=expiry_time,
            **kwargs,
        )
        if validate:
            return IssueCollectRequestResponsePydantic(**raw_response.body)
        return api_client.construct_model_instance(IssueCollectRequestResponsePydantic, raw_response.body)
    
    
    def issue_collect_request(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
        validate: bool = False,
    ) -> IssueCollectRequestResponsePydantic:
        raw_response = self.raw.issue_collect_request(
            body=body,
            reference_id=reference_id,
            payer_upi=payer_upi,
            payee_account=payee_account,
            amount=amount,
            purpose_message=purpose_message,
            expiry_time=expiry_time,
        )
        if validate:
            return IssueCollectRequestResponsePydantic(**raw_response.body)
        return api_client.construct_model_instance(IssueCollectRequestResponsePydantic, raw_response.body)


class ApiForpost(BaseApi):
    # this class is used by api classes that refer to endpoints by path and http method names

    async def apost(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
        **kwargs,
    ) -> typing.Union[
        ApiResponseFor200Async,
        api_client.ApiResponseWithoutDeserializationAsync,
        AsyncGeneratorResponse,
    ]:
        args = self._issue_collect_request_mapped_args(
            body=body,
            reference_id=reference_id,
            payer_upi=payer_upi,
            payee_account=payee_account,
            amount=amount,
            purpose_message=purpose_message,
            expiry_time=expiry_time,
        )
        return await self._aissue_collect_request_oapg(
            body=args.body,
            **kwargs,
        )
    
    def post(
        self,
        body: typing.Optional[IssueCollectRequestRequest] = None,
        reference_id: typing.Optional[str] = None,
        payer_upi: typing.Optional[str] = None,
        payee_account: typing.Optional[str] = None,
        amount: typing.Optional[typing.Union[int, float]] = None,
        purpose_message: typing.Optional[str] = None,
        expiry_time: typing.Optional[int] = None,
    ) -> typing.Union[
        ApiResponseFor200,
        api_client.ApiResponseWithoutDeserialization,
    ]:
        """  """
        args = self._issue_collect_request_mapped_args(
            body=body,
            reference_id=reference_id,
            payer_upi=payer_upi,
            payee_account=payee_account,
            amount=amount,
            purpose_message=purpose_message,
            expiry_time=expiry_time,
        )
        return self._issue_collect_request_oapg(
            body=args.body,
        )

