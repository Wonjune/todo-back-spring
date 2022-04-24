package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 멤버변수의 getter/setter 생성
@Entity
@Builder // 롬복의 builder() 메서드 사용가
@NoArgsConstructor
@AllArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class UserEntity {
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy="uuid")
	private String id; // 사용자에게 고유하게 부여되는 id
	
	@Column(nullable = false)
	private String username; // 사용자의 이
	
	@Column(nullable = false)
	private String email; // 사용자의 email, 아이디와 같은 기능을 한다.
	
	@Column(nullable = false)
	private String password; // 패스워드

}
