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

package com.google.firebasehosting.v1beta1.model;

/**
 * The current certificate provisioning status information for a domain.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DomainProvisioning extends com.google.api.client.json.GenericJson {

  /**
   * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> certChallengeDiscoveredTxt;

  /**
   * The DNS challenge for generating a certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertDnsChallenge certChallengeDns;

  /**
   * The HTTP challenge for generating a certificate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CertHttpChallenge certChallengeHttp;

  /**
   * The certificate provisioning status; updated when Firebase Hosting provisions an SSL
   * certificate for the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certStatus;

  /**
   * The IPs found at the last DNS fetch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> discoveredIps;

  /**
   * The time at which the last DNS fetch occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dnsFetchTime;

  /**
   * The DNS record match status as of the last DNS fetch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dnsStatus;

  /**
   * The list of IPs to which the domain is expected to resolve.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> expectedIps;

  /**
   * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCertChallengeDiscoveredTxt() {
    return certChallengeDiscoveredTxt;
  }

  /**
   * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
   * @param certChallengeDiscoveredTxt certChallengeDiscoveredTxt or {@code null} for none
   */
  public DomainProvisioning setCertChallengeDiscoveredTxt(java.util.List<java.lang.String> certChallengeDiscoveredTxt) {
    this.certChallengeDiscoveredTxt = certChallengeDiscoveredTxt;
    return this;
  }

  /**
   * The DNS challenge for generating a certificate.
   * @return value or {@code null} for none
   */
  public CertDnsChallenge getCertChallengeDns() {
    return certChallengeDns;
  }

  /**
   * The DNS challenge for generating a certificate.
   * @param certChallengeDns certChallengeDns or {@code null} for none
   */
  public DomainProvisioning setCertChallengeDns(CertDnsChallenge certChallengeDns) {
    this.certChallengeDns = certChallengeDns;
    return this;
  }

  /**
   * The HTTP challenge for generating a certificate.
   * @return value or {@code null} for none
   */
  public CertHttpChallenge getCertChallengeHttp() {
    return certChallengeHttp;
  }

  /**
   * The HTTP challenge for generating a certificate.
   * @param certChallengeHttp certChallengeHttp or {@code null} for none
   */
  public DomainProvisioning setCertChallengeHttp(CertHttpChallenge certChallengeHttp) {
    this.certChallengeHttp = certChallengeHttp;
    return this;
  }

  /**
   * The certificate provisioning status; updated when Firebase Hosting provisions an SSL
   * certificate for the domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertStatus() {
    return certStatus;
  }

  /**
   * The certificate provisioning status; updated when Firebase Hosting provisions an SSL
   * certificate for the domain.
   * @param certStatus certStatus or {@code null} for none
   */
  public DomainProvisioning setCertStatus(java.lang.String certStatus) {
    this.certStatus = certStatus;
    return this;
  }

  /**
   * The IPs found at the last DNS fetch.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDiscoveredIps() {
    return discoveredIps;
  }

  /**
   * The IPs found at the last DNS fetch.
   * @param discoveredIps discoveredIps or {@code null} for none
   */
  public DomainProvisioning setDiscoveredIps(java.util.List<java.lang.String> discoveredIps) {
    this.discoveredIps = discoveredIps;
    return this;
  }

  /**
   * The time at which the last DNS fetch occurred.
   * @return value or {@code null} for none
   */
  public String getDnsFetchTime() {
    return dnsFetchTime;
  }

  /**
   * The time at which the last DNS fetch occurred.
   * @param dnsFetchTime dnsFetchTime or {@code null} for none
   */
  public DomainProvisioning setDnsFetchTime(String dnsFetchTime) {
    this.dnsFetchTime = dnsFetchTime;
    return this;
  }

  /**
   * The DNS record match status as of the last DNS fetch.
   * @return value or {@code null} for none
   */
  public java.lang.String getDnsStatus() {
    return dnsStatus;
  }

  /**
   * The DNS record match status as of the last DNS fetch.
   * @param dnsStatus dnsStatus or {@code null} for none
   */
  public DomainProvisioning setDnsStatus(java.lang.String dnsStatus) {
    this.dnsStatus = dnsStatus;
    return this;
  }

  /**
   * The list of IPs to which the domain is expected to resolve.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExpectedIps() {
    return expectedIps;
  }

  /**
   * The list of IPs to which the domain is expected to resolve.
   * @param expectedIps expectedIps or {@code null} for none
   */
  public DomainProvisioning setExpectedIps(java.util.List<java.lang.String> expectedIps) {
    this.expectedIps = expectedIps;
    return this;
  }

  @Override
  public DomainProvisioning set(String fieldName, Object value) {
    return (DomainProvisioning) super.set(fieldName, value);
  }

  @Override
  public DomainProvisioning clone() {
    return (DomainProvisioning) super.clone();
  }

}
