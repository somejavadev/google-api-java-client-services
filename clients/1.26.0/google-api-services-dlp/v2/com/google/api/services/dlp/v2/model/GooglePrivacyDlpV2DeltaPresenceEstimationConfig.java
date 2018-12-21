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

package com.google.api.services.dlp.v2.model;

/**
 * δ-presence metric, used to estimate how likely it is for an attacker to figure out that one given
 * individual appears in a de-identified dataset. Similarly to the k-map metric, we cannot compute
 * δ-presence exactly without knowing the attack dataset, so we use a statistical model instead.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2DeltaPresenceEstimationConfig extends com.google.api.client.json.GenericJson {

  /**
   * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-
   * identifiers field must appear in exactly one field of one auxiliary table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2StatisticalTable> auxiliaryTables;

  /**
   * Fields considered to be quasi-identifiers. No two fields can have the same tag. [required]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GooglePrivacyDlpV2QuasiId> quasiIds;

  /**
   * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Required if no column is
   * tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionCode;

  /**
   * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-
   * identifiers field must appear in exactly one field of one auxiliary table.
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2StatisticalTable> getAuxiliaryTables() {
    return auxiliaryTables;
  }

  /**
   * Several auxiliary tables can be used in the analysis. Each custom_tag used to tag a quasi-
   * identifiers field must appear in exactly one field of one auxiliary table.
   * @param auxiliaryTables auxiliaryTables or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationConfig setAuxiliaryTables(java.util.List<GooglePrivacyDlpV2StatisticalTable> auxiliaryTables) {
    this.auxiliaryTables = auxiliaryTables;
    return this;
  }

  /**
   * Fields considered to be quasi-identifiers. No two fields can have the same tag. [required]
   * @return value or {@code null} for none
   */
  public java.util.List<GooglePrivacyDlpV2QuasiId> getQuasiIds() {
    return quasiIds;
  }

  /**
   * Fields considered to be quasi-identifiers. No two fields can have the same tag. [required]
   * @param quasiIds quasiIds or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationConfig setQuasiIds(java.util.List<GooglePrivacyDlpV2QuasiId> quasiIds) {
    this.quasiIds = quasiIds;
    return this;
  }

  /**
   * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Required if no column is
   * tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionCode() {
    return regionCode;
  }

  /**
   * ISO 3166-1 alpha-2 region code to use in the statistical modeling. Required if no column is
   * tagged with a region-specific InfoType (like US_ZIP_5) or a region code.
   * @param regionCode regionCode or {@code null} for none
   */
  public GooglePrivacyDlpV2DeltaPresenceEstimationConfig setRegionCode(java.lang.String regionCode) {
    this.regionCode = regionCode;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2DeltaPresenceEstimationConfig set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2DeltaPresenceEstimationConfig) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2DeltaPresenceEstimationConfig clone() {
    return (GooglePrivacyDlpV2DeltaPresenceEstimationConfig) super.clone();
  }

}
