package edu.nchansenfgcu;

public class JsonParser {
  private String author_name;
  private String author_email;
  private String author_url;

  protected String getAuthor_name() {
    return author_name;
  }

  protected String getAuthor_email() {
    return author_email;
  }

  protected String getAuthor_url() {
    return author_url;
  }

  public void setAuthor_name(String author_name) {
    this.author_name = author_name;
  }

  public void setAuthor_email(String author_email) {
    this.author_email = author_email;
  }

  public void setAuthor_url(String author_url) {
    this.author_url = author_url;
  }
}
