package com.spample.webAndApi.restservice.abstraction;


import com.spample.webAndApi.restservice.RestAPIExecutor;

import java.util.Map;



public interface APIExecutor {

	APIResponse deleteAndBuild(String url);

	APIResponse getAndBuild(String url);

	APIResponse putAndBuild(String url);

	APIResponse postAndBuild(String url);

	RestAPIExecutor withPathParam(String key, String value);

	RestAPIExecutor withPathParams(Map<String, String> pathParams);

	RestAPIExecutor withRequestParam(String key, String value);

	RestAPIExecutor withRequestParams(Map<String, String> requestParams);

	RestAPIExecutor withRequestHeaders(Map<String, String> headers);

	RestAPIExecutor withRequestHeader(String headerName, String headerValue);

	RestAPIExecutor withRequestBody(String request);

}
