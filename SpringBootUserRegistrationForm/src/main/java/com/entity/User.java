package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="User_Register")
public class User {
private String name;
@Id
private String userName;
private String email;
private String phone;
private String password;
private String conformPassword;
private String gender;
}
