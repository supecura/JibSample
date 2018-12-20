
package spcr.api;

import static spark.Spark.*;

public class Controller {

	public static void main(String[] args) {
		get("/jib", (req, res) -> "sample");
	}
}
