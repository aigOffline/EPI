int n = a.length;
  HashSet < Integer > hash = new HashSet < Integer > ();
  for (int i = 0; i < n; i++) {
    hash.add(a[i]);
  }
  for (int i = 1; i <= n + 1; i++) {
    if (!hash.contains(i)) {
      return i;
    }
  }
  return -1;
