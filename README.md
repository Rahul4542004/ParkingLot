# Parking Lot Management System 🅿️

This is a console-based Parking Lot Management System implemented in **Java** using **Object-Oriented Design principles**. The application simulates real-world parking lot operations, including vehicle entry, exit, ticketing, and dynamic billing strategies.

---

## 🧩 Features

- 🚗 Supports multiple vehicle types (e.g., Car, Bike)
- 🏢 Multiple parking floors with configurable capacities
- 🎟️ Ticket generation and billing on vehicle exit
- 💰 Customizable pricing using **Strategy Pattern**
- 🏭 Dynamic pricing strategy creation via **Factory Pattern**
- ⏱️ Accurate billing based on entry and exit timestamps
- 📦 Clean object-oriented design using interfaces and abstractions

---

## 🛠️ Design Patterns Used

- **Strategy Pattern**: To support pluggable billing strategies like flat rate, per-30-minute pricing, etc.
- **Factory Pattern**: `PricingStrategyFactory` dynamically returns the appropriate billing strategy based on parking duration.

---

## 📁 Key Components

| Class                   | Responsibility                                                              |
|-------------------------|-----------------------------------------------------------------------------|
| `Vehicle`               | Interface implemented by `Car`, `Bike`, etc.                                |
| `Spot`                  | Represents an individual parking spot                                       |
| `Floor`                 | Manages a list of spots and assigns vehicles to available spots             |
| `ParkingLot`            | High-level manager for adding/removing vehicles across all floors           |
| `Ticket`                | Handles start and end time, and computes cost using pricing strategies      |
| `PricingStrategy`       | Interface for defining different billing strategies                         |
| `Per30MinStrategy`, `Per15MinStrategy`, etc. | Concrete implementations of `PricingStrategy`         |
| `PricingStrategyFactory`| Chooses and returns a suitable `PricingStrategy` based on parked duration   |

---

## ✅ Sample Output

### 🚗 Vehicles Added

Vehicle added at floorNo - 1, spot - 101

Vehicle added at floorNo - 1, spot - 102

Vehicle added at floorNo - 2, spot - 205

---

### 🅿️ Available Spots

Floor 1:

Floor 2: Spot#206 Spot#207 Spot#208

Floor 3: Spot#301

---

### ❌ Vehicles Removed

Vehicle removed from spot - 101

Vehicle removed from spot - 102

---

### 🧾 Ticket History (After Removals)

Ticket:

Floor: 1, Spot: 101

Vehicle: Tata | Petrol | TS01 | 5 Gears

Cost: 200$

Ticket:

Floor: 1, Spot: 102

Vehicle: Honda | Petrol | AP02 | Kick Start: Yes

Cost: 450$

---

### 🅿️ Available Spots

Floor 1: Spot#101 Spot#102

Floor 2: Spot#206 Spot#207 Spot#208

Floor 3: Spot#301

---

### ❌ Vehicle Removed

Vehicle removed from spot - 205

---

### 🧾 Final Ticket History

Ticket:

Floor: 1, Spot: 101

Vehicle: Tata | Petrol | TS01 | 5 Gears

Cost: 200$

Ticket:

Floor: 1, Spot: 102

Vehicle: Honda | Petrol | AP02 | Kick Start: Yes

Cost: 450$

Ticket:

Floor: 2, Spot: 205

Vehicle: Toyota | Diesel | TS02 | 6 Gears

Cost: 100$

## 📦 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/Rahul4542004/ParkingLot.git
   cd ParkingLot
