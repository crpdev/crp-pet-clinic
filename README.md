# crp-pet-clinic
A Spring Framework Application following the Spring Framework 5: Beginner to Guru Module

`April 18, 2020`

- Github repository creation: crp-pet-clinic 
- Cloning the repository and project setup using IntelliJ Spring Initializr
- Adding Initial base project files to the repository
- Issues created in Github to track progress of development

`April 19, 2020`

- **_SOLID_** principles
    - _Single responsibility_
        - Every class should have a single responsibility
        - Not more than one reason for a class to change
        - Be cautious not to extend a class more than a page
        - Avoid GOD class
        - When needed, split big classes into smaller ones.
    - _Open-Closed_
        - Classes should be open for extension but closed for modification
        - Behaviours should be allowed for extension by not modifying it
        - Use private variables with Getter & Setters only when needed
        - Make use of abstract base classes when common functionality is needed
    - _Liskov Substitution Principle_
        - Objects should be replaceable with instances of their subtypes without altering the correctness of the program
        - Violations will fail the 'Is A' test
        - Eg: A Square 'Is A' Rectangle, but the vice versa is not true
    - _Interface Segregation Principle_
        - Define Interfaces are specific to a client
        - Client specific Interfaces are better than God Interfaces
        - Encourages minimal dependencies
    - _Dependency Inversion Principle_
        - Abstractions shouldn't depend upon the details
        - Details should depend upon Abstractions
        - Higher & Lower level objects depend on the same abstract interaction
        - Not to be confused with Dependency Injection - where object obtains dependent objects

- Why _SOLID_ Principles in OOP?
    - **_Better Quality Code_**
    - **_Easily Maintainable and Testable_**
    - **_Avoid Tight Coupling in your code_**
    

`April 20, 2020` 

Spring Dependency Injection Concepts - git@github.com:crpdev/crp-di.git

`April 28, 2020`

Spring Boot Jokes App Asignment - git@github.com:crpdev/jokes-app.git

`April 29, 2020`

- Refactoring multi-module application: pet-clinic-data & pet-clinic-web

`April 30, 2020`

- Implementing the model and services
    - Model
        - Defining BaseEntity [Long: id] which is common to all model
        - Person, Owner, Vet, Pet and PetType
    - Services
        - Implement base CRUD service
        - Implement model specific service
            - OwnerService
            - PetService
            - VetService
            
`May 01, 2020`
            
- Implementing Map Service
    - AbstractMapService using Generics to be used by model map services
        - OwnerServiceMap
        - VetServiceMap
        - PetServiceMap
- Implementing Controller and draft templates for Owner and Vet

`May 02, 2020`

- Defining a DataLoader to load sample data at startup
- Refactoring view templates to display data based on the sample data from DataLoader

`May 03, 2020`

Spring Boot - External Properties - git@github.com:crpdev/spring5-di-properties.git

`May 04, 2020`

- Copy master templates and static resources from the Spring Pet Clinic project
- Apply the template to index, owner, vets and pets pages
- Configure WRO4J [Web Resource Optimise for Java] to manage and consolidate less files as css
- Add missing i18n property files

`May 05, 2020`

- Created Visit, Speciality entities and associate to Vet
- Added contact info property to Owner entity
- DataLoader enhanced with Pet, PetType and Owner addons

`May 06, 2020`

- Create Speciality Map Service Implementation
- DataLoader for Pet, PetType and Speciality

`May 07, 2020`

- Fixing broken links on the master template applied

`May 08, 2020`
    
                                `Happy Learning: crpdev`
                       Last Activity Update: **_May 08, 2020_**
