.PHONY: all
all: ./mvnw
	./mvnw -B -q verify

./mvnw:
	mvn -q -N io.takari:maven:0.7.7:wrapper

-include User.mk
-include ../User.mk
-include ~/User.mk
