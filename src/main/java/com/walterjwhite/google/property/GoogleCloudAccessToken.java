package com.walterjwhite.google.property;

import com.walterjwhite.google.guice.property.property.DefaultValue;
import com.walterjwhite.google.guice.property.property.GuiceProperty;

public interface GoogleCloudAccessToken extends GuiceProperty {
  @DefaultValue String Default = "accessToken.json";
}
