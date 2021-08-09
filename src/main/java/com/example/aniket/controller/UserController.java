package com.example.aniket.controller;

import com.example.aniket.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
@RestController()
public class UserController {


    private  static HashMap<Integer, User> userRepo=new HashMap<>();
    static {
        User user1=new User();
        user1.setId(1);
        user1.setName("Aniket Raj");
        userRepo.put(user1.getId(),user1);

        User user2=new User();
        user2.setId(2);
        user2.setName("King Khan");
        userRepo.put(user2.getId(),user2);



    }
    @RequestMapping(value = "/users")
    public ResponseEntity<Object> getUser() {

        return new ResponseEntity<>(userRepo.values(), HttpStatus.OK);
    }


    @RequestMapping(value="/users",method = RequestMethod.POST)
    public String checkPost(@RequestBody(required = false)User u){
        u=new User();
        u.setName("asdsa");
        u.setId(3);
        userRepo.put(u.getId(), u);
        return "Ya im done";

    }
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createProduct(@RequestBody(required = false) User u) {
        u=new User();
        u.setName("asdsa");
        u.setId(3);
        userRepo.put(u.getId(), u);
        return new ResponseEntity<>("User added successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users",method = RequestMethod.DELETE)
    public ResponseEntity<Object> checkDelete()
    {

        userRepo.remove(3);

        HttpStatus created = HttpStatus.CREATED;
        return (new ResponseEntity<Object>("Deleted",HttpStatus.CREATED));
    }



}
