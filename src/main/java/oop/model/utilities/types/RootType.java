package oop.model.utilities.types;

/**
 * Created by mayukh42 on 4/6/17.
 *
 * Root type of a JSON
 *  Backus-Naur Form:
 *      Root :=     Json | Array | String | Number
 *      Json :=     [Pair]  (i.e. list of key, value pairs)
 *      Pair :=     (key, Root)
 *      Array :=    Root :: Array
 *
 *  TODO: Correct the Backus-Naur as per below example
 *  Keys are of type String. Example of a JSON data:
 *  json = {
 *      name: Alice,
 *      age: 33,
 *      languages: [C, C++, Java, Python]
 *      education: [{
 *              name: BS,
 *              college: Stanford,
 *              grade: 3.8
 *          }, {
 *              name: MS,
 *              college: MIT,
 *              grade: 3.6
 *          }, {
 *              name: PhD,
 *              college: MIT,
 *              grade: 3.7
 *          }]
 *  }
 */
public abstract class RootType {

    public abstract Object getObject();
    public abstract String toString();
}
