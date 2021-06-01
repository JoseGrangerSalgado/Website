package com.google.sps.data;


public final class Task {

  private final long id;
  private final String title;
  private final long timestamp;

  public Task(long id, String title, long timestamp) {
    this.id = id;
    this.title = title;
    this.timestamp = timestamp;
  }
}