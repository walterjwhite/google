package com.walterjwhite.google;

import com.google.auth.oauth2.ServiceAccountCredentials;
import com.walterjwhite.google.guice.property.property.Property;
import com.walterjwhite.google.property.GoogleCloudAccessToken;
import java.io.FileInputStream;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Provider;

public class CredentialsProvider implements Provider<ServiceAccountCredentials> {
  protected final ServiceAccountCredentials credentials;

  @Inject
  public CredentialsProvider(
      @Property(GoogleCloudAccessToken.class) String googleCloudAccessTokenFilename)
      throws IOException {
    credentials =
        ServiceAccountCredentials.fromStream(new FileInputStream(googleCloudAccessTokenFilename));
  }

  @Override
  public ServiceAccountCredentials get() {
    return credentials;
  }
}
