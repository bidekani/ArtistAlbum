# ArtistAlbum
How do we build and run it? 
<b>mvn clean test spring-boot:run <b>

# What tools did you use?
spring-boot
lombok - to have more readable and clean code
swagger - to generate API documantation with very easy and powerfull interface to use and test by team.(like frontend team or other teams that use service)
javamelody - for monitoring the service and api calls

I find an implementation of CoverArtArchive that made api call easier and faster.
coverartarchive-api
"
fm.last
coverartarchive-api
"


# Did you intentionally leave stuff out or made any shortcuts?
In that case, what and why? 
I used some framework in simpleast way(like Slf4j)  and also used a 3'd party api (coverartarchive-api) 
also most of the functions I used are inside spring-boot. 

# How and why did you select the source of the profile information (i.e. the source of your choice)?
I used discogs, it seems it has  description for most of artist and has it in json format.

# Regarding the heavy load 
I used caching system to make the service faster.it is in-memory caching and used a Cron-job running every Saturday to clear the cache(depending the system load and our esource it could be evry night or ...)
A monitoring framework also used to monitor the api calls and monitory where we have most heavy-load , monitoring will give more clear vision and solution to improve our service.
monitoring tools could be find in the /monitoring url from the baseUrl.

# Regarding the test case 
two Test case provided that will help to understand how the service works.
