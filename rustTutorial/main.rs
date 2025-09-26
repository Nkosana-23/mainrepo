use std::io;

fn calc(a :i32, b: i32) -> i32{//Parameters with types ... could be explained more, return type after ->
    //find out about if statements  //basically a turbocharged if else

    //match statements + logic combination
    let mut input = String::new(); //creates mut input var with with an empty string, mut is neccesary in this case
    io::stdin().read_line(&mut input).unwrap(); //Reads a line of text from standard input and appends it to input.
    symbol = input.trim();//Prints the user's input to the terminal, removing leading/trailing whitespace.
    match symbol {  //basically a turbocharged if else
        "+" => a + b, //implicit returns
        "-" => a - b,
        "*" => a * b,
        "/" => a / b,
        _ => 0, // default case if no pattern matches
    }

    //match statements

}

gn main() {
    println!("Hello, world!");
    let x: i32 = 5; // let x which is an interger of 32 be = 5 (immutable)
    let mut y = 10; // let mutable y = 10
    y = 15; //this is allowed since y is mutable
    //x = 6; cannnot happen since x is immutable (good code should always use immutable variables)
    //(: type) annotation optional, rust can infer usually
    //shadowing:you can redeclare with let to create a new variablewith the same name
    let z: i32 = 5;
    let z = z + 1; //z is now z, old z is shadowed
    //scalars (aka single type val)
    let interger: i16 = 1; // scalar signed int
    let intergar: u16 = 1; // scalar unsigned int
    let float: f64 = 3.14; //scalar float
    let learning_rust: bool = true; // scalar bool
    let char = 'a'; //char being equal to a
    //scalars

    // Compound Data Sets
    // tuples - fixed size groups of heterogenous types
    let tup: (i32, f64, char, bool, u16) = (500, 6.4, 'a', true, 5); //tuple with different data types
    let (v, w, x, y, z) = tup;
    println!("{}", tup.3); //access by index

    //arrays
    let arr: [i32; 3] = [1, 2, 3]; // array of 3 i32 intergers
    let first = arr[0];
    println("{}", first)
    //arrays

    //slices
    println("{}", &arr[1])
  //slices
    //Compound Data sets

    //input statements
    let mut input = String::new(); //creates mut input var with with an empty string, mut is neccesary in this case
    io::stdin().read_line(&mut input).unwrap(); //Reads a line of text from standard input and appends it to input.
    println!("You typed: {}", input.trim()); //Prints the user's input to the terminal, removing leading/trailing whitespace.

    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();

    let command = input.trim(); // still a &str
    println!("Command received: {}", command);
    //input statements

    //pulling from fn add
    let result = calc(20, 80);//calls add, a = 20, b = 80 then runs the script
    println("result: {}", result);

    //pulling from fn add

}
