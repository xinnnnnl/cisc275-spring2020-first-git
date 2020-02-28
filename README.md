# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
("Fido",4), ("Fido",3),("Alfie",4), Animal a, and Animal b.

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?
The class definition for the Comparator is where it has 
return a.getLegs() - b.getLegs();
The Comparator constructor is call at 
under the Collection.sort(dogs, new Comparator<Animal>()