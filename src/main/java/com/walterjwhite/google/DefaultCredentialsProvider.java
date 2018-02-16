package com.walterjwhite.google;

import com.google.api.gax.core.CredentialsProvider;
import com.google.auth.Credentials;
import java.io.IOException;
import javax.inject.Inject;

public class DefaultCredentialsProvider implements CredentialsProvider {
  protected final Credentials credentials;

  @Inject
  public DefaultCredentialsProvider(Credentials credentials) {
    super();
    this.credentials = credentials;
  }

  @Override
  public Credentials getCredentials() throws IOException {
    return credentials;
  }
}
