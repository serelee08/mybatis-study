# mybatis-study

A practical study project focused on building production-grade backend applications using Java, Spring Boot, MyBatis, and MariaDB.

## Tech Stack
- Java 21
- Spring Boot 4.0.6
- MyBatis 4.0.1
- MariaDB
- Lombok
- Maven

## Project Structure
```
src/main/java
└── com.study.mybatisstudy
    └── member
        ├── controller   # REST API layer
        ├── service      # Business logic layer
        ├── dao          # Data access layer (MyBatis Mapper)
        └── vo           # Value Objects (Data model)
src/main/resources
└── mapper
    └── member.xml       # MyBatis SQL mapping
```

## API Endpoints
| Method | URL | Description |
|--------|-----|-------------|
| POST | /members | Register new member |
| GET | /members/{memberId} | Get member by ID |
| GET | /members | Get all members |

## What I'm Learning
- Layered architecture pattern (Controller → Service → DAO)
- MyBatis SQL mapping and dynamic queries
- RESTful API design
- Database integration with MariaDB
- Spring Boot dependency injection
- Git/GitHub version control workflow
- Production-level code structure used in Korean enterprise development

## Goals
- Build real-world backend systems
- Understand enterprise architecture patterns
- Develop skills applicable to fintech and large-scale SI projects
