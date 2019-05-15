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
 * Information about a person merged from various data sources such as the authenticated user's
 * contacts and profile data.
 *
 * Most fields can have multiple items. The items in a field have no guaranteed order, but each non-
 * empty field is guaranteed to have exactly one field with `metadata.primary` set to true.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Person extends com.google.api.client.json.GenericJson {

  /**
   * The person's street addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Address> addresses;

  static {
    // hack to force ProGuard to consider Address used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Address.class);
  }

  /**
   * **DEPRECATED** (Please use `person.ageRanges` instead)**
   *
   * The person's read-only age range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ageRange;

  /**
   * The person's read-only age ranges.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AgeRangeType> ageRanges;

  static {
    // hack to force ProGuard to consider AgeRangeType used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AgeRangeType.class);
  }

  /**
   * The person's biographies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Biography> biographies;

  static {
    // hack to force ProGuard to consider Biography used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Biography.class);
  }

  /**
   * The person's birthdays.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Birthday> birthdays;

  static {
    // hack to force ProGuard to consider Birthday used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Birthday.class);
  }

  /**
   * The person's bragging rights.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BraggingRights> braggingRights;

  static {
    // hack to force ProGuard to consider BraggingRights used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BraggingRights.class);
  }

  /**
   * The person's read-only cover photos.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CoverPhoto> coverPhotos;

  static {
    // hack to force ProGuard to consider CoverPhoto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CoverPhoto.class);
  }

  /**
   * The person's email addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EmailAddress> emailAddresses;

  static {
    // hack to force ProGuard to consider EmailAddress used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(EmailAddress.class);
  }

  /**
   * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the resource. Used for web
   * cache validation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The person's events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Event> events;

  static {
    // hack to force ProGuard to consider Event used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Event.class);
  }

  /**
   * The person's genders.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Gender> genders;

  static {
    // hack to force ProGuard to consider Gender used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Gender.class);
  }

  /**
   * The person's instant messaging clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ImClient> imClients;

  static {
    // hack to force ProGuard to consider ImClient used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ImClient.class);
  }

  /**
   * The person's interests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Interest> interests;

  static {
    // hack to force ProGuard to consider Interest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Interest.class);
  }

  /**
   * The person's locale preferences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Locale> locales;

  static {
    // hack to force ProGuard to consider Locale used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Locale.class);
  }

  /**
   * The person's group memberships.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Membership> memberships;

  static {
    // hack to force ProGuard to consider Membership used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Membership.class);
  }

  /**
   * Read-only metadata about the person.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PersonMetadata metadata;

  /**
   * The person's names.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Name> names;

  static {
    // hack to force ProGuard to consider Name used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Name.class);
  }

  /**
   * The person's nicknames.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Nickname> nicknames;

  static {
    // hack to force ProGuard to consider Nickname used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Nickname.class);
  }

  /**
   * The person's occupations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Occupation> occupations;

  static {
    // hack to force ProGuard to consider Occupation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Occupation.class);
  }

  /**
   * The person's past or current organizations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Organization> organizations;

  static {
    // hack to force ProGuard to consider Organization used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Organization.class);
  }

  /**
   * The person's phone numbers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PhoneNumber> phoneNumbers;

  /**
   * The person's read-only photos.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Photo> photos;

  /**
   * The person's relations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Relation> relations;

  /**
   * The person's read-only relationship interests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RelationshipInterest> relationshipInterests;

  /**
   * The person's read-only relationship statuses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RelationshipStatus> relationshipStatuses;

  /**
   * The person's residences.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Residence> residences;

  /**
   * The resource name for the person, assigned by the server. An ASCII string with a max length of
   * 27 characters, in the form of `people/`person_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * The person's SIP addresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SipAddress> sipAddresses;

  /**
   * The person's skills.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Skill> skills;

  /**
   * The person's read-only taglines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Tagline> taglines;

  /**
   * The person's associated URLs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Url> urls;

  /**
   * The person's user defined data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UserDefined> userDefined;

  /**
   * The person's street addresses.
   * @return value or {@code null} for none
   */
  public java.util.List<Address> getAddresses() {
    return addresses;
  }

  /**
   * The person's street addresses.
   * @param addresses addresses or {@code null} for none
   */
  public Person setAddresses(java.util.List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  /**
   * **DEPRECATED** (Please use `person.ageRanges` instead)**
   *
   * The person's read-only age range.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgeRange() {
    return ageRange;
  }

  /**
   * **DEPRECATED** (Please use `person.ageRanges` instead)**
   *
   * The person's read-only age range.
   * @param ageRange ageRange or {@code null} for none
   */
  public Person setAgeRange(java.lang.String ageRange) {
    this.ageRange = ageRange;
    return this;
  }

  /**
   * The person's read-only age ranges.
   * @return value or {@code null} for none
   */
  public java.util.List<AgeRangeType> getAgeRanges() {
    return ageRanges;
  }

  /**
   * The person's read-only age ranges.
   * @param ageRanges ageRanges or {@code null} for none
   */
  public Person setAgeRanges(java.util.List<AgeRangeType> ageRanges) {
    this.ageRanges = ageRanges;
    return this;
  }

  /**
   * The person's biographies.
   * @return value or {@code null} for none
   */
  public java.util.List<Biography> getBiographies() {
    return biographies;
  }

  /**
   * The person's biographies.
   * @param biographies biographies or {@code null} for none
   */
  public Person setBiographies(java.util.List<Biography> biographies) {
    this.biographies = biographies;
    return this;
  }

  /**
   * The person's birthdays.
   * @return value or {@code null} for none
   */
  public java.util.List<Birthday> getBirthdays() {
    return birthdays;
  }

  /**
   * The person's birthdays.
   * @param birthdays birthdays or {@code null} for none
   */
  public Person setBirthdays(java.util.List<Birthday> birthdays) {
    this.birthdays = birthdays;
    return this;
  }

  /**
   * The person's bragging rights.
   * @return value or {@code null} for none
   */
  public java.util.List<BraggingRights> getBraggingRights() {
    return braggingRights;
  }

  /**
   * The person's bragging rights.
   * @param braggingRights braggingRights or {@code null} for none
   */
  public Person setBraggingRights(java.util.List<BraggingRights> braggingRights) {
    this.braggingRights = braggingRights;
    return this;
  }

  /**
   * The person's read-only cover photos.
   * @return value or {@code null} for none
   */
  public java.util.List<CoverPhoto> getCoverPhotos() {
    return coverPhotos;
  }

  /**
   * The person's read-only cover photos.
   * @param coverPhotos coverPhotos or {@code null} for none
   */
  public Person setCoverPhotos(java.util.List<CoverPhoto> coverPhotos) {
    this.coverPhotos = coverPhotos;
    return this;
  }

  /**
   * The person's email addresses.
   * @return value or {@code null} for none
   */
  public java.util.List<EmailAddress> getEmailAddresses() {
    return emailAddresses;
  }

  /**
   * The person's email addresses.
   * @param emailAddresses emailAddresses or {@code null} for none
   */
  public Person setEmailAddresses(java.util.List<EmailAddress> emailAddresses) {
    this.emailAddresses = emailAddresses;
    return this;
  }

  /**
   * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the resource. Used for web
   * cache validation.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The [HTTP entity tag](https://en.wikipedia.org/wiki/HTTP_ETag) of the resource. Used for web
   * cache validation.
   * @param etag etag or {@code null} for none
   */
  public Person setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The person's events.
   * @return value or {@code null} for none
   */
  public java.util.List<Event> getEvents() {
    return events;
  }

  /**
   * The person's events.
   * @param events events or {@code null} for none
   */
  public Person setEvents(java.util.List<Event> events) {
    this.events = events;
    return this;
  }

  /**
   * The person's genders.
   * @return value or {@code null} for none
   */
  public java.util.List<Gender> getGenders() {
    return genders;
  }

  /**
   * The person's genders.
   * @param genders genders or {@code null} for none
   */
  public Person setGenders(java.util.List<Gender> genders) {
    this.genders = genders;
    return this;
  }

  /**
   * The person's instant messaging clients.
   * @return value or {@code null} for none
   */
  public java.util.List<ImClient> getImClients() {
    return imClients;
  }

  /**
   * The person's instant messaging clients.
   * @param imClients imClients or {@code null} for none
   */
  public Person setImClients(java.util.List<ImClient> imClients) {
    this.imClients = imClients;
    return this;
  }

  /**
   * The person's interests.
   * @return value or {@code null} for none
   */
  public java.util.List<Interest> getInterests() {
    return interests;
  }

  /**
   * The person's interests.
   * @param interests interests or {@code null} for none
   */
  public Person setInterests(java.util.List<Interest> interests) {
    this.interests = interests;
    return this;
  }

  /**
   * The person's locale preferences.
   * @return value or {@code null} for none
   */
  public java.util.List<Locale> getLocales() {
    return locales;
  }

  /**
   * The person's locale preferences.
   * @param locales locales or {@code null} for none
   */
  public Person setLocales(java.util.List<Locale> locales) {
    this.locales = locales;
    return this;
  }

  /**
   * The person's group memberships.
   * @return value or {@code null} for none
   */
  public java.util.List<Membership> getMemberships() {
    return memberships;
  }

  /**
   * The person's group memberships.
   * @param memberships memberships or {@code null} for none
   */
  public Person setMemberships(java.util.List<Membership> memberships) {
    this.memberships = memberships;
    return this;
  }

  /**
   * Read-only metadata about the person.
   * @return value or {@code null} for none
   */
  public PersonMetadata getMetadata() {
    return metadata;
  }

  /**
   * Read-only metadata about the person.
   * @param metadata metadata or {@code null} for none
   */
  public Person setMetadata(PersonMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The person's names.
   * @return value or {@code null} for none
   */
  public java.util.List<Name> getNames() {
    return names;
  }

  /**
   * The person's names.
   * @param names names or {@code null} for none
   */
  public Person setNames(java.util.List<Name> names) {
    this.names = names;
    return this;
  }

  /**
   * The person's nicknames.
   * @return value or {@code null} for none
   */
  public java.util.List<Nickname> getNicknames() {
    return nicknames;
  }

  /**
   * The person's nicknames.
   * @param nicknames nicknames or {@code null} for none
   */
  public Person setNicknames(java.util.List<Nickname> nicknames) {
    this.nicknames = nicknames;
    return this;
  }

  /**
   * The person's occupations.
   * @return value or {@code null} for none
   */
  public java.util.List<Occupation> getOccupations() {
    return occupations;
  }

  /**
   * The person's occupations.
   * @param occupations occupations or {@code null} for none
   */
  public Person setOccupations(java.util.List<Occupation> occupations) {
    this.occupations = occupations;
    return this;
  }

  /**
   * The person's past or current organizations.
   * @return value or {@code null} for none
   */
  public java.util.List<Organization> getOrganizations() {
    return organizations;
  }

  /**
   * The person's past or current organizations.
   * @param organizations organizations or {@code null} for none
   */
  public Person setOrganizations(java.util.List<Organization> organizations) {
    this.organizations = organizations;
    return this;
  }

  /**
   * The person's phone numbers.
   * @return value or {@code null} for none
   */
  public java.util.List<PhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }

  /**
   * The person's phone numbers.
   * @param phoneNumbers phoneNumbers or {@code null} for none
   */
  public Person setPhoneNumbers(java.util.List<PhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }

  /**
   * The person's read-only photos.
   * @return value or {@code null} for none
   */
  public java.util.List<Photo> getPhotos() {
    return photos;
  }

  /**
   * The person's read-only photos.
   * @param photos photos or {@code null} for none
   */
  public Person setPhotos(java.util.List<Photo> photos) {
    this.photos = photos;
    return this;
  }

  /**
   * The person's relations.
   * @return value or {@code null} for none
   */
  public java.util.List<Relation> getRelations() {
    return relations;
  }

  /**
   * The person's relations.
   * @param relations relations or {@code null} for none
   */
  public Person setRelations(java.util.List<Relation> relations) {
    this.relations = relations;
    return this;
  }

  /**
   * The person's read-only relationship interests.
   * @return value or {@code null} for none
   */
  public java.util.List<RelationshipInterest> getRelationshipInterests() {
    return relationshipInterests;
  }

  /**
   * The person's read-only relationship interests.
   * @param relationshipInterests relationshipInterests or {@code null} for none
   */
  public Person setRelationshipInterests(java.util.List<RelationshipInterest> relationshipInterests) {
    this.relationshipInterests = relationshipInterests;
    return this;
  }

  /**
   * The person's read-only relationship statuses.
   * @return value or {@code null} for none
   */
  public java.util.List<RelationshipStatus> getRelationshipStatuses() {
    return relationshipStatuses;
  }

  /**
   * The person's read-only relationship statuses.
   * @param relationshipStatuses relationshipStatuses or {@code null} for none
   */
  public Person setRelationshipStatuses(java.util.List<RelationshipStatus> relationshipStatuses) {
    this.relationshipStatuses = relationshipStatuses;
    return this;
  }

  /**
   * The person's residences.
   * @return value or {@code null} for none
   */
  public java.util.List<Residence> getResidences() {
    return residences;
  }

  /**
   * The person's residences.
   * @param residences residences or {@code null} for none
   */
  public Person setResidences(java.util.List<Residence> residences) {
    this.residences = residences;
    return this;
  }

  /**
   * The resource name for the person, assigned by the server. An ASCII string with a max length of
   * 27 characters, in the form of `people/`person_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * The resource name for the person, assigned by the server. An ASCII string with a max length of
   * 27 characters, in the form of `people/`person_id.
   * @param resourceName resourceName or {@code null} for none
   */
  public Person setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The person's SIP addresses.
   * @return value or {@code null} for none
   */
  public java.util.List<SipAddress> getSipAddresses() {
    return sipAddresses;
  }

  /**
   * The person's SIP addresses.
   * @param sipAddresses sipAddresses or {@code null} for none
   */
  public Person setSipAddresses(java.util.List<SipAddress> sipAddresses) {
    this.sipAddresses = sipAddresses;
    return this;
  }

  /**
   * The person's skills.
   * @return value or {@code null} for none
   */
  public java.util.List<Skill> getSkills() {
    return skills;
  }

  /**
   * The person's skills.
   * @param skills skills or {@code null} for none
   */
  public Person setSkills(java.util.List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  /**
   * The person's read-only taglines.
   * @return value or {@code null} for none
   */
  public java.util.List<Tagline> getTaglines() {
    return taglines;
  }

  /**
   * The person's read-only taglines.
   * @param taglines taglines or {@code null} for none
   */
  public Person setTaglines(java.util.List<Tagline> taglines) {
    this.taglines = taglines;
    return this;
  }

  /**
   * The person's associated URLs.
   * @return value or {@code null} for none
   */
  public java.util.List<Url> getUrls() {
    return urls;
  }

  /**
   * The person's associated URLs.
   * @param urls urls or {@code null} for none
   */
  public Person setUrls(java.util.List<Url> urls) {
    this.urls = urls;
    return this;
  }

  /**
   * The person's user defined data.
   * @return value or {@code null} for none
   */
  public java.util.List<UserDefined> getUserDefined() {
    return userDefined;
  }

  /**
   * The person's user defined data.
   * @param userDefined userDefined or {@code null} for none
   */
  public Person setUserDefined(java.util.List<UserDefined> userDefined) {
    this.userDefined = userDefined;
    return this;
  }

  @Override
  public Person set(String fieldName, Object value) {
    return (Person) super.set(fieldName, value);
  }

  @Override
  public Person clone() {
    return (Person) super.clone();
  }

}