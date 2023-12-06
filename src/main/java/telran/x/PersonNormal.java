package telran.x;

import java.time.LocalDate;

import telran.reflect.Id;
import telran.reflect.Index;

public record PersonNormal (@Id long personId, String personName, @Index LocalDate birthDate){

}
