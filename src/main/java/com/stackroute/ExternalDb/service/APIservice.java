package com.stackroute.ExternalDb.service;

import com.stackroute.ExternalDb.domain.Database;

import java.net.URI;

public interface APIservice {


   public Database getData(URI url);
}
