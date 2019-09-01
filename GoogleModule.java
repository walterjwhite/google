package com.walterjwhite.google;

import com.google.auth.Credentials;
import com.google.inject.AbstractModule;

public class GoogleModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Credentials.class).toProvider(CredentialsProvider.class);
    bind(com.google.api.gax.core.CredentialsProvider.class).to(DefaultCredentialsProvider.class);
  }
}
