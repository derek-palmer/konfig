<?php

/**
 * SimpleTest
 * PHP version 7.4
 *
 * @category Class
 * @package  SnapTrade
 * @author   Konfig
 * @link     https://konfigthis.com
 */

/**
 * SnapTrade
 *
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 * Generated by: https://konfigthis.com
 */


namespace SnapTrade\Test\Api;

use \SnapTrade\Configuration;
use \SnapTrade\ApiException;
use \SnapTrade\ObjectSerializer;
use PHPUnit\Framework\TestCase;

class SimpleTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * test initialization of clinet
     */
    public function testClient()
    {
        $snaptrade = new \SnapTrade\Client(
            clientId: "SNAPTRADE_CLIENT_ID",
            consumerKey: "SNAPTRADE_CONSUMER_KEY"
        );
    }
}
