from flask import Flask, render_template
from flask import Flask
from flask_sqlalchemy import SQLAlchemy




app = Flask(__name__)

@app.route("/") #routes to different pages e.g home 
def index():
    return render_template("index.html")

@app.route("/todo") #routes to different pages e.g home 
def todo():
    return render_template("todo.html")



if __name__ in "__main__":
    app.run(debug=True)   
