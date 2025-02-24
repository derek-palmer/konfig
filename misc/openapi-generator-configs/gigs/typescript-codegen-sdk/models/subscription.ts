/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */

import type { plan } from './plan';
import type { user } from './user';

export type subscription = {
    /**
     * Type of object is always `subscription`.
     */
    object: string;
    /**
     * Unique identifier for the subscription.
     */
    id: string;
    currentPeriod: any | null;
    /**
     * The phone number attached to the SIM in E.164 format. Only available for voice plans.
     */
    phoneNumber: string | null;
    plan: plan;
    sim: any | null;
    /**
     * The current status of the subscription.
     */
    status: subscription.status;
    user: user;
    /**
     * Time when the subscription was activated.
     */
    activatedAt: string | null;
    /**
     * Time when the subscription was canceled.
     */
    canceledAt: string | null;
    /**
     * Time when the subscription was created.
     */
    createdAt: string;
    /**
     * Time when the subscription was ended.
     */
    endedAt: string | null;
    /**
     * Time when the subscription was first used.
     */
    firstUsageAt: string | null;
};

export namespace subscription {

    /**
     * The current status of the subscription.
     */
    export enum status {
        PENDING = 'pending',
        ACTIVE = 'active',
        ENDED = 'ended',
    }


}

