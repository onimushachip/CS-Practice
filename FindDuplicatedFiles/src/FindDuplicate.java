import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* 
 * Given a list of directory info including directory path, and all the files with contents in this directory, 
 * you need to find out all the groups of duplicate files in the file system in terms of their paths.
 * A group of duplicate files consists of at least two files that have exactly the same content.
 * A single directory info string in the input list has the following format:
 * "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
 * It means there are n files (f1.txt, f2.txt ... fn.txt with content f1_content, f2_content ... fn_content, respectively) in directory root/d1/d2/.../dm. 
 * Note that n >= 1 and m >= 0. If m = 0, it means the directory is just the root directory.
 * The output is a list of group of duplicate file paths. For each group, it contains all the file paths of the files that have the same content. 
 * A file path is a string that has the following format:
 * "directory_path/file_name.txt"
 * 
 */

public class FindDuplicate {
	private List<List<String>> result = new ArrayList<List<String>>();
	private HashMap<String, Set<String>> fileMap = new HashMap<>();
	
    public List<List<String>> findDuplicate(String[] paths) {
    	
    	for (int i = 0; i < paths.length; i++) {
    		String[] fileList = paths[i].split("\\s+");
    		
    		for (int j = 1; j < fileList.length; j++) {
    			int indexContent = fileList[j].indexOf('(');
    			String fileName = fileList[0] + "/" + fileList[j].substring(0, indexContent);
    			String content = fileList[j].substring(indexContent);
    			
    			if (fileMap.containsKey(content)) {
    				Set<String> filePathList = fileMap.get(content);
    				
    				filePathList.add(fileName);
    				
    				fileMap.put(content, filePathList);
    			}
    			else {
    				Set<String> filePathList = new HashSet<String>();
    				
    				filePathList.add(fileName);
    				
    				fileMap.put(content, filePathList);
    			}
    		}
    	}
    	
    	for (String content : fileMap.keySet()) {
    		int numberOfFiles = fileMap.get(content).size();
    		
    		if (numberOfFiles > 1) {
    			ArrayList<String> duplicateList = new ArrayList<>();
    			
    			for (String fileName : fileMap.get(content)) {
    				duplicateList.add(fileName);
    			}
    			
    			this.result.add(duplicateList);
    		}
    	}
        
    	return result;
    }

}
