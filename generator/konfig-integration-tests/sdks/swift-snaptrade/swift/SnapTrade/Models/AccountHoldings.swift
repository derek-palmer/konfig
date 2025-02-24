//
// AccountHoldings.swift
//
// Generated by Konfig
// https://konfigthis.com
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

/** Account Holdings */
public struct AccountHoldings: Codable, JSONEncodable, Hashable {

    public var account: SnapTradeHoldingsAccount?
    public var balances: [Balance]?
    public var positions: [Position]?
    public var totalValue: SnapTradeHoldingsTotalValue?

    public init(account: SnapTradeHoldingsAccount? = nil, balances: [Balance]? = nil, positions: [Position]? = nil, totalValue: SnapTradeHoldingsTotalValue? = nil) {
        self.account = account
        self.balances = balances
        self.positions = positions
        self.totalValue = totalValue
    }

    public enum CodingKeys: String, CodingKey, CaseIterable {
        case account
        case balances
        case positions
        case totalValue = "total_value"
    }

    public var additionalProperties: [String: AnyCodable] = [:]

    public subscript(key: String) -> AnyCodable? {
        get {
            if let value = additionalProperties[key] {
                return value
            }
            return nil
        }

        set {
            additionalProperties[key] = newValue
        }
    }

    // Encodable protocol methods

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: CodingKeys.self)
        try container.encodeIfPresent(account, forKey: .account)
        try container.encodeIfPresent(balances, forKey: .balances)
        try container.encodeIfPresent(positions, forKey: .positions)
        try container.encodeIfPresent(totalValue, forKey: .totalValue)
        var additionalPropertiesContainer = encoder.container(keyedBy: String.self)
        try additionalPropertiesContainer.encodeMap(additionalProperties)
    }

    // Decodable protocol methods

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: CodingKeys.self)

        account = try container.decodeIfPresent(SnapTradeHoldingsAccount.self, forKey: .account)
        balances = try container.decodeIfPresent([Balance].self, forKey: .balances)
        positions = try container.decodeIfPresent([Position].self, forKey: .positions)
        totalValue = try container.decodeIfPresent(SnapTradeHoldingsTotalValue.self, forKey: .totalValue)
        var nonAdditionalPropertyKeys = Set<String>()
        nonAdditionalPropertyKeys.insert("account")
        nonAdditionalPropertyKeys.insert("balances")
        nonAdditionalPropertyKeys.insert("positions")
        nonAdditionalPropertyKeys.insert("total_value")
        let additionalPropertiesContainer = try decoder.container(keyedBy: String.self)
        additionalProperties = try additionalPropertiesContainer.decodeMap(AnyCodable.self, excludedKeys: nonAdditionalPropertyKeys)
    }
}

