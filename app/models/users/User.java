package models;

import com.sun.org.apache.xml.internal.dtm.ref.EmptyIterator;


import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

//first add the plugin to build.sbt
import org.mindrot.jbcrypt.BCrypt;



@Entity
public class User extends Model {
    
    @Id
    public String email;
    public String pass;
    public String city;
    public int points = 0;
    public int completed = 0;
    
   
    @OneToMany
    public List<Item> items;

    public User(){

    }

    public User(String email, String pass){
        
        this.email = email;
        this.pass = pass;  

    }

    public static final Finder<String, User> find = new Finder<String, User>(User.class);

    public static final List<User> findAll() {
        return User.find.all();
    }

    //public static User auth(String email, String pass){
     //   return find.query().where().eq("email", email).eq("pass", pass).findUnique();

    //}

    public static User auth(String email, String pass) {
        User user = User.findPersonByEmail(email);
        
        if (user != null && BCrypt.checkpw(pass, user.pass)) {
            return user;
        } else {
            return null;
        }
    }

    public static User findPersonByEmail(String email){

        List<User> allUsers = User.findAll();
        for (int i = 0; i < allUsers.size(); i++) {
            if (allUsers.get(i).getEmail().equals(email)) {
                  return allUsers.get(i);
              }
          }
          return null;
        }


    public String getEmail(){
        return email;
    }
    public String getPass(){
        return pass;
    }
    public int getPoints(){
        return points;
    }

    public String getCity(){
        return city;
    }

    public int getCompletedCount(){
        //simply divide the current point by 10 to get the num of completed items 
        //seen as uers get 10 points for each item complated

        //this is in case the users points go below 0, that way we would not be dividing by negative points
        if(points < 0){
        completed = 0 / 10;
        }
        else{
            completed = points / 10;
        }
    
        return completed;
    }

    public void setEmail(String e){
        this.email = e;
    }
    public void setPass(String pass){
        //this.pass = p;
        this.pass = BCrypt.hashpw(pass, BCrypt.gensalt());
    }
    public void setCity(String city){
        
        this.city = city;
    }
    public void addPoints(){
        points += 10;
        
    }
     public void subtractPoints(){
        if(points == 0){
            //keep points from going negative
            points = 0;
        }
        else{
            points -= 10;
        }
        
    }


     public static User getUserById(String id){
        if (id == null){
            return null;
        }
        else {
            return find.byId(id);
        }

    }

    public void addItem(Item i) {
        items.add(i);
        
    }

     public List<Item> getItems() {
        return items;
        
    }

    public int getNumUncompleted(){
       
        return getItems().size() - getCompletedCount();
    }

    
}
