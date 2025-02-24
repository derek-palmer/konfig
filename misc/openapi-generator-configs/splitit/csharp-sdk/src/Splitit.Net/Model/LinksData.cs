/*
 * splitit-web-api-v3
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Splitit.Net.Client.OpenAPIDateConverter;

namespace Splitit.Net.Model
{
    /// <summary>
    /// LinksData
    /// </summary>
    [DataContract]
    public partial class LinksData :  IEquatable<LinksData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LinksData" /> class.
        /// </summary>
        /// <param name="checkout">checkout.</param>
        /// <param name="learnMore">learnMore.</param>
        /// <param name="termsConditions">termsConditions.</param>
        /// <param name="privacyPolicy">privacyPolicy.</param>
        public LinksData(string checkout = default(string), string learnMore = default(string), string termsConditions = default(string), string privacyPolicy = default(string))
        {
            this.Checkout = checkout;
            this.LearnMore = learnMore;
            this.TermsConditions = termsConditions;
            this.PrivacyPolicy = privacyPolicy;
        }

        /// <summary>
        /// Gets or Sets Checkout
        /// </summary>
        [DataMember(Name="Checkout", EmitDefaultValue=false)]
        public string Checkout { get; set; }

        /// <summary>
        /// Gets or Sets LearnMore
        /// </summary>
        [DataMember(Name="LearnMore", EmitDefaultValue=false)]
        public string LearnMore { get; set; }

        /// <summary>
        /// Gets or Sets TermsConditions
        /// </summary>
        [DataMember(Name="TermsConditions", EmitDefaultValue=false)]
        public string TermsConditions { get; set; }

        /// <summary>
        /// Gets or Sets PrivacyPolicy
        /// </summary>
        [DataMember(Name="PrivacyPolicy", EmitDefaultValue=false)]
        public string PrivacyPolicy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LinksData {\n");
            sb.Append("  Checkout: ").Append(Checkout).Append("\n");
            sb.Append("  LearnMore: ").Append(LearnMore).Append("\n");
            sb.Append("  TermsConditions: ").Append(TermsConditions).Append("\n");
            sb.Append("  PrivacyPolicy: ").Append(PrivacyPolicy).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as LinksData);
        }

        /// <summary>
        /// Returns true if LinksData instances are equal
        /// </summary>
        /// <param name="input">Instance of LinksData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LinksData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Checkout == input.Checkout ||
                    (this.Checkout != null &&
                    this.Checkout.Equals(input.Checkout))
                ) && 
                (
                    this.LearnMore == input.LearnMore ||
                    (this.LearnMore != null &&
                    this.LearnMore.Equals(input.LearnMore))
                ) && 
                (
                    this.TermsConditions == input.TermsConditions ||
                    (this.TermsConditions != null &&
                    this.TermsConditions.Equals(input.TermsConditions))
                ) && 
                (
                    this.PrivacyPolicy == input.PrivacyPolicy ||
                    (this.PrivacyPolicy != null &&
                    this.PrivacyPolicy.Equals(input.PrivacyPolicy))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Checkout != null)
                    hashCode = hashCode * 59 + this.Checkout.GetHashCode();
                if (this.LearnMore != null)
                    hashCode = hashCode * 59 + this.LearnMore.GetHashCode();
                if (this.TermsConditions != null)
                    hashCode = hashCode * 59 + this.TermsConditions.GetHashCode();
                if (this.PrivacyPolicy != null)
                    hashCode = hashCode * 59 + this.PrivacyPolicy.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
