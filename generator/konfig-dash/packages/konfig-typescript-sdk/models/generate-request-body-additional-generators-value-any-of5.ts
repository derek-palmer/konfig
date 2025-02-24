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

// May contain unused imports in some cases
// @ts-ignore
import { GenerateRequestBodyGeneratorsAndroidCopyFilesInner } from './generate-request-body-generators-android-copy-files-inner';
// May contain unused imports in some cases
// @ts-ignore
import { GenerateRequestBodyGeneratorsAndroidFilesValue } from './generate-request-body-generators-android-files-value';
// May contain unused imports in some cases
// @ts-ignore
import { GenerateRequestBodyGeneratorsAndroidGit } from './generate-request-body-generators-android-git';
// May contain unused imports in some cases
// @ts-ignore
import { GenerateRequestBodyGeneratorsAndroidTest } from './generate-request-body-generators-android-test';
// May contain unused imports in some cases
// @ts-ignore
import { GenerateRequestBodyGeneratorsJavaClientStateWithExamplesInner } from './generate-request-body-generators-java-client-state-with-examples-inner';

/**
 * 
 * @export
 * @interface GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
 */
export interface GenerateRequestBodyAdditionalGeneratorsValueAnyOf5 {
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'generator': GenerateRequestBodyAdditionalGeneratorsValueAnyOf5GeneratorEnum;
    /**
     * 
     * @type {{ [key: string]: GenerateRequestBodyGeneratorsAndroidFilesValue; }}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'files'?: { [key: string]: GenerateRequestBodyGeneratorsAndroidFilesValue; };
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'version': string;
    /**
     * 
     * @type {GenerateRequestBodyGeneratorsAndroidGit}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'git': GenerateRequestBodyGeneratorsAndroidGit;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'outputDirectory': string;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'readmeSnippet'?: string;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'readmeSupportingDescriptionSnippet'?: string;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'readmeDescriptionSnippet'?: string;
    /**
     * Configure copying a set of files from a source to a destination. This is useful if you have custom implementations that you would like duplicated across multiple SDK repos.
     * @type {Array<GenerateRequestBodyGeneratorsAndroidCopyFilesInner>}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'copyFiles'?: Array<GenerateRequestBodyGeneratorsAndroidCopyFilesInner>;
    /**
     * Filepath to file containing override for the section in generated documentation for setting up authentication in the SDK.
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'apiDocumentationAuthenticationPartial'?: string;
    /**
     * 
     * @type {boolean}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'disabled'?: boolean;
    /**
     * 
     * @type {number}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'defaultTimeout'?: number;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'userAgent'?: string;
    /**
     * 
     * @type {GenerateRequestBodyGeneratorsAndroidTest}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'test'?: GenerateRequestBodyGeneratorsAndroidTest;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'language': GenerateRequestBodyAdditionalGeneratorsValueAnyOf5LanguageEnum;
    /**
     * 
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'clientName': string;
    /**
     * The path to a logo image that is copied to the generated C# SDK to be used as an image on https://nuget.org. This is required and important for branding your SDK.
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'logoPath': string;
    /**
     * The name of this package that shows up on https://nuget.org (e.g. \"Acme.Net\")
     * @type {string}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'packageName': string;
    /**
     * A list of stateful properties generated into the SDK that can be used in custom implementation hooks. This is useful when you need state in the SDK that is not described in the OpenAPI Specification such as a key used for request signing.
     * @type {Array<string>}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'clientState'?: Array<string>;
    /**
     * A list of stateful properties generated into the SDK that can be used in custom implementation hooks. This is useful when you need state in the SDK that is not described in the OpenAPI Specification such as a key used for request signing. This is different from the \"clientState\" field in that it also includes examples for the generated documentation
     * @type {Array<GenerateRequestBodyGeneratorsJavaClientStateWithExamplesInner>}
     * @memberof GenerateRequestBodyAdditionalGeneratorsValueAnyOf5
     */
    'clientStateWithExamples'?: Array<GenerateRequestBodyGeneratorsJavaClientStateWithExamplesInner>;
}

type GenerateRequestBodyAdditionalGeneratorsValueAnyOf5GeneratorEnum = 'csharp'
type GenerateRequestBodyAdditionalGeneratorsValueAnyOf5LanguageEnum = 'csharp'


