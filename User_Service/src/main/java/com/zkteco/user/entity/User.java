package com.zkteco.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_tbl")
public class User {

	@Id
	@SequenceGenerator(name = "idSequence", sequenceName = "idSequence", initialValue = 101, allocationSize = 1)
	@GeneratedValue(generator = "idSequence")
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private Long deptId;
}
