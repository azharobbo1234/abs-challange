# Catalog ABS Microservices Framework

Reliable Software Engineering (RSE) Lab Faculty of Computer Science Universitas Indonesia

***

Welcome to the code repository

## Table of Contents

1. [Table of Contents](#table-of-contents)
2. [Setup Environment](#setup-environment)
3. [Demo Product](#demo-link)

## Setup Environment

1. Install Java (Currently recommend to use Java 8)
1. Install Apache Ant (Currently recommended to use version 1.10.8)

## Demo Product

1. Configure `build.bat` or `build.sh` file. The value of `-Dabsproduct` represent an existing product name in [Product.abs](src/abs/framework/Product.abs) file. Several examples of Product already being defined in this file. To create a new product, choose any available feature in [FeatureModel.abs](src/abs/framework/FeatureModel.abs) and define it in [Product.abs](src/abs/framework/Product.abs) file.
1. Configure `config.properties` file to define a credentials and database name for the generated product. You must use Superadmin credential since ABS microservice also use it for automatically create Database. 
1. Configure `run.bat` or `run.sh` file to run the generated JAR file.


