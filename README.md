# Builder Pattern Assignment - Travel Package
**Author:** Madiyar Akylbek

## Description
This project implements the Builder design pattern in Java to create a Travel Package system. It features a fluent API and demonstrates how a single Director can use the exact same construction steps to produce two different representations of a product:
1. A Java Object (`TravelPackage` with state validation)
2. A Text String (Formatted travel itinerary)

## Project Structure
* **Product:** `TravelPackage` (Immutable object)
* **Builder Interface:** `TravelPackageBuilder`
* **Concrete Builders:** `PackageObjectBuilder` and `ItineraryBuilder`
* **Director:** `TravelDirector` (Contains ready-made trip configurations)