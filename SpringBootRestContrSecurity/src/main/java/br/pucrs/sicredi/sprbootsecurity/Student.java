package br.pucrs.sicredi.sprbootsecurity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Student {
	private String id;
	private String name;
	private String description;
	private List<Course> courses;
}