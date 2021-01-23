# Table of contents
1. [Installation](#installation)
   1. [Docker](#docker)
   2. [Online database](#onlinedata)
2. [Reference Document](#referencedoc)


## Installation <a name="introduction"></a>
### <a id="docker"></a>Option 1: postgres docker
1. Install docker on [window](https://docs.docker.com/docker-for-windows/install/) or [MacOs](https://docs.docker.com/docker-for-mac/install/)
2. Pull postgres image: `docker pull postgres`
3. Start docker container: `docker run --name postgres -e POSTGRES_PASSWORD=[yourpassword] -d postgres`
4. Update `${USERNAME}` and `${PASSWORD}` in `application.yml` file (or respective enviroment files):
### <a id="onlinedata"></a>Option 2: create an online postgres database :
1. [Elephant](https://www.elephantsql.com/)
2. Obtain the resource link, username, and password
3. Update `${USERNAME}` and `${PASSWORD}` in `application.yml` file (or respective enviroment files):

## Reference document <a id="referencedoc"></a>
1. postgres common commands [Kartones](https://gist.github.com/Kartones/dd3ff5ec5ea238d4c546)
2. java Jpa query methods: [docs.spring.io](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)
3. Spring core annotation cheatsheet: [www.adevguide.com](https://www.adevguide.com/all-spring-annotations-cheat-sheet/)
4. Hibernate annotations: [docs.jboss.org](https://docs.jboss.org/hibernate/annotations/3.5/reference/en/html_single/#entity-hibspec)
