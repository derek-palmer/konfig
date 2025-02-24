/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */

export type coverage = {
    /**
     * Type of object is always `coverage`.
     */
    object: string;
    /**
     * Unique identifier for the coverage configuration.
     */
    id: string;
    /**
     * List of countries in ISO 3166-1 alpha-2 format covered by this coverage configuration.
     */
    countries: Array<string>;
    /**
     * A human-readable identifier of the coverage configuration, might not be unique.
     */
    name: string;
};

