/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.people.v1.model;

/**
 * Metadata about a field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FieldMetadata extends com.google.api.client.json.GenericJson {

  /**
   * True if the field is the primary field; false if the field is a secondary field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean primary;

  /**
   * The source of the field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Source source;

  /**
   * True if the field is verified; false if the field is unverified. A verified field is typically
   * a name, email address, phone number, or website that has been confirmed to be owned by the
   * person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verified;

  /**
   * True if the field is the primary field; false if the field is a secondary field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrimary() {
    return primary;
  }

  /**
   * True if the field is the primary field; false if the field is a secondary field.
   * @param primary primary or {@code null} for none
   */
  public FieldMetadata setPrimary(java.lang.Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * The source of the field.
   * @return value or {@code null} for none
   */
  public Source getSource() {
    return source;
  }

  /**
   * The source of the field.
   * @param source source or {@code null} for none
   */
  public FieldMetadata setSource(Source source) {
    this.source = source;
    return this;
  }

  /**
   * True if the field is verified; false if the field is unverified. A verified field is typically
   * a name, email address, phone number, or website that has been confirmed to be owned by the
   * person.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerified() {
    return verified;
  }

  /**
   * True if the field is verified; false if the field is unverified. A verified field is typically
   * a name, email address, phone number, or website that has been confirmed to be owned by the
   * person.
   * @param verified verified or {@code null} for none
   */
  public FieldMetadata setVerified(java.lang.Boolean verified) {
    this.verified = verified;
    return this;
  }

  @Override
  public FieldMetadata set(String fieldName, Object value) {
    return (FieldMetadata) super.set(fieldName, value);
  }

  @Override
  public FieldMetadata clone() {
    return (FieldMetadata) super.clone();
  }

}
