// Brute Force Appoarach
// We use Set because that contains unique element : O(nlogn + mlogm)
// Then Create a List to cp[y from set and return that
public static ArrayList < Integer > findUnion(int arr1[], int arr2[], int n, int m) {
  Set < Integer > st = new HashSet < Integer > ();
  // adding in a set
  for (int i = 0; i < n; i++)
    st.add(arr1[i]);
  for (int i = 0; i < m; i++)
    st.add(arr2[i]);

  ArrayList < Integer > ans = new ArrayList < > ();
  for (Integer x: st)
    ans.add(x);

  Collections.sort(ans);

  return ans;
}



// Optimal 
public static List < Integer > sortedArray(int[] arr1, int[] arr2) {
  int n = arr1.length, m = arr2.length;
  int i = 0, j = 0; // pointers
  ArrayList < Integer > Union = new ArrayList <> (); // Uninon vector
  while (i < n && j < m) {
    if (arr1[i] <= arr2[j]) // Case 1 and 2
    {
      if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
        Union.add(arr1[i]);
      i++;
    } else // case 3
    {
      if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
        Union.add(arr2[j]);
      j++;
    }
  }
  while (i < n) // IF any element left in arr1
  {
    if (Union.get(Union.size() - 1) != arr1[i])
      Union.add(arr1[i]);
    i++;
  }
  while (j < m) // If any elements left in arr2
  {
    if (Union.get(Union.size() - 1) != arr2[j])
      Union.add(arr2[j]);
    j++;
  }
  return Union;

}
