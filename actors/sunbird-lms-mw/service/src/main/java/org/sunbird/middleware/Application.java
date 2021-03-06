package org.sunbird.middleware;

import org.sunbird.actor.service.SunbirdMWService;
import org.sunbird.common.models.util.JsonKey;
import org.sunbird.learner.util.SchedulerManager;
import org.sunbird.learner.util.Util;

/** @author Mahesh Kumar Gangula */
public class Application {

  public static void main(String[] args) {
    SunbirdMWService.init();
    checkCassandraConnection();
    SchedulerManager.schedule();
  }

  public static void checkCassandraConnection() {
    Util.checkCassandraDbConnections(JsonKey.SUNBIRD);
    Util.checkCassandraDbConnections(JsonKey.SUNBIRD_PLUGIN);
    Util.checkCassandraDbConnections(Util.COURSE_KEY_SPACE_NAME);
  }
}
