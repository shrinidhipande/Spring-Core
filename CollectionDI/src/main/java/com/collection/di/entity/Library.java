package com.collection.di.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Library {
	private List<String> storyBooks;
	private Set<String> techBooks;
	private Map<String,Shelf> places; 
}
