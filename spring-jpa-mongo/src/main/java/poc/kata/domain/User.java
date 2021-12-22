//{
//        "_id" : ObjectId("5f6f1447eb206d45fcbf76d4"),
//        "name" : "Jindal Takla",
//        "location" : "jahanum",
//        "username" : "ganjamasti"
//}
package poc.kata.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

  @Id
  private String id;

  private String name;
  private String location;
  private String username;

  public User() {
  }

  public User(String name, String location, String username) {
    this.name = name;
    this.location = location;
    this.username = username;
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", location=" + location + ", username=" + username + "]";
  }


}
