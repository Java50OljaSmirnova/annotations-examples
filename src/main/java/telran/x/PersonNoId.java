package telran.x;

import java.time.LocalDate;

import telran.reflect.*;

public record PersonNoId (long personId, String personName, @Index LocalDate birthDate){
	
}
