#  Event Application

This is a **web application** that allows users to:

* **Create events**
* **Send full invitation cards to guests**
* **Guests can leave comments on events**
* **Comments are analyzed for sentiment using a Python script**

---

## Features

* Create & manage events
* Generate full invitation cards
* Guests can post comments on events
* Sentiment analysis of comments (via Python + TextBlob)
* Simple HTML & CSS frontend

---

##  Tech Stack

* **Backend:** Java, Spring Boot, Spring Data JPA
* **Frontend:** HTML, CSS
* **Database:** H2 (for development)
* **Python:** Sentiment analysis script (TextBlob)
* **Future:** PyTorch models for more advanced analysis


##  Installation

### Clone the repository

```bash
git clone https://github.com/neginaatai/your-repo-name.git
cd Event_application 

### Run the backend

Make sure you have **Java 17+** and **Maven** installed.

```bash
./mvnw spring-boot:run
```

or on Windows:

```bash
mvnw.cmd spring-boot:run
```

### Run the sentiment analysis

Requires **Python 3.10+** and `textblob`.

```bash
pip install textblob
python -m textblob.download_corpora
```

Then you can test it manually:

```bash
python sentiment_analysis.py "I love this event"

##  Usage

* Open your browser at:

  ```
  http://localhost:8080
  ```
* Create a new event.
* Send invitation cards (through your event form / endpoint).
* Guests can comment on the event.
* The comment is sent to the Python script for sentiment analysis, and stored with its sentiment in the database.


##  Future Improvements

*  Use PyTorch to predict more nuanced sentiments or categorize comments.
*  Add user authentication and different roles.
*  Improve the layout and design of the web application (possibly with React or Thymeleaf).
*  Migrate to PostgreSQL or MySQL for production.

---


